package th.ac.npru.se.ntk.product;

/**
 * An interface that defines a contract for managing objects
 * by allowing deletion using an identifier.
 * 
 * <p>This interface should be implemented by any class whose 
 * instances can be deleted by a unique identifier (typically a database ID).</p>
 * 
 * <p>Example implementations might involve removing entries 
 * from a list, database, or another storage mechanism.</p>
 * 
 * @author [Your Name]
 * @version 1.0
 */
public interface Manageble {

    /**
     * Deletes an object by its unique identifier.
     *
     * @param id the unique identifier of the object to delete
     * @return {@code true} if the deletion was successful, 
     *         {@code false} otherwise (e.g., if the ID was not found)
     */
    boolean deleteById(int id);
}
