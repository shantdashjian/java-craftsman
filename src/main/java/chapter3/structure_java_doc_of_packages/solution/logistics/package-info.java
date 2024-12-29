/**
 * Classes for managing an inventory of supplies.
 *
 * <p>
 * The core class is the {@link logistics.Inventory} that lets you
 * <ul>
 * <li> stock it up from a {@link logistics.CargoShip},
 * <li> dispose of any contaminated {@link logistics.Supply},
 * <li> and search for any {@link logistics.Supply} by name.
 * </ul>
 *
 * <p>
 * The classes let you unload supplies and immediately dispose of any supply
 * that was contaminated.
 * <pre>
 * Inventory inventory = new Inventory();
 * inventory.stockUp(cargoShip.unload());
 * inventory.disposeContaminatedSupplies();
 * inventory.getContaminatedSupplies().isEmpty(); // true
 * </pre>
 */
package chapter3.structure_java_doc_of_packages.solution.logistics;