package DesignPattern;


/**
 * Open-Closed Principle (OCP)
 * 	 - open for extension but closed for modification
 * 	 - Generic methods
 * 	 - flexible
 * 	 - use implementations
 *
 * 	 + don't have to modify existing code
 * 	 + implement new extension and use but existing code without touching it
 */

// Before
// For every new Hash method is a new else if needed which is apparently not a nice solution and breaks the OCP
class HashPassword {
    public String hashPassword(String password, String hashingType)
    {
        String hashedPassword = null;
        if(hashingType == "Base64")
        {
            hashedPassword="hashed with Base64";
        }
        else if(hashingType == "MD5")
        {
            hashedPassword="hashed with MD5";
        }

        return hashedPassword;
    }
}

// After
// Like this there is a new class for every new Hash method and the old implementation doesnt have to be modified
interface PasswordHasher
{
    String hashPassword(String password);
}
class MD5Hasher implements PasswordHasher
{
    @Override
    public String hashPassword(String password)
    {
        return "hashed with SHA256";
    }
}
class Base64Hasher implements PasswordHasher
{
    @Override
    public String hashPassword(String password)
    {
        return "hashed with 64";
    }
}