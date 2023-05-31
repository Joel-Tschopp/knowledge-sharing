package DesignPattern;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

/**
 * Interface Segregation Principle (ISP)
 * 	 - Split Interfaces into smaller interfaces
 * 	 - only implement needed methods
 * 	 - don't implement an interface with methods that aren't going to be used
 * 	 - YAGNI = You Ain't Going To Need It
 * 	 - use extending interfaces and implement multiple interfaces
 *
 * 	 + don't have unused Methods
 * 	 + better naming
 */

// Before
// In this example the PasswordHasher interface is implemented into a class which doesnt need every method.
interface PasswordHasher
{
    String hashPassword(String password);
    String decodePasswordFromHash(String hash);
}

class OnlyHasher implements PasswordHasher
{
    @Override
    public String hashPassword(String password)
    {
        return "hashed with base64";
    }

    @Override
    public String decodePasswordFromHash(String hash) throws NotImplementedException {
        throw NotImplementedException();
    }
}

// After
// Create more Interfaces and implement only the ones you need
interface PasswordHasher
{
    String hashPassword(String password);
}
interface Decryptable extends PasswordHasher
{
    String decodePasswordFromHash(String hash);
}

class Base64Hasher implements PasswordHasher
{
    @Override
    public String hashPassword(String password)
    {
        return "hashed with base64";
    }

    @Override
    public String decodePasswordFromHash(String hash)
    {
        return "decoded from base64";
    }
}