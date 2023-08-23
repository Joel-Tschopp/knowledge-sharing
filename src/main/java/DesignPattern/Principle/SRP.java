package DesignPattern.Principle;

/**
  * Single Responsibility Principle (SRP)
 * 	 - separation of concerns
 * 	 - create different classes
 * 	 - ask yourself are those function for the same thing responsible.
 * 	 - one responsibility per class
 * 	 - anti god class
 *
 *   + code is easier to refactor
 *   + code is more readable
 */
/*
// Before
// This class is an overkill since it hashes and saves the password. Those are two completely different concerns
class PasswordHasher
{
    public void hashPassword()
    {
        //hashing implementation
    }
    public void savePassword()
    {
        //save to the db
    }
}

// After
// Hash and Save are now splitted into two different classes
class HashPassword
{
    public void hashPassword()
    {
        //hashing implementation
    }
}

class SavePassword {
    public void savePassword()
    {
        //save to the db
    }
}
*/
