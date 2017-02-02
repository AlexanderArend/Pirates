
package com.alexanderarend.dto;


public class PlayerRequest {

    protected int maxHealth;
    protected int currentHealth;
    protected int deductedhealth;
    protected String movementFactory;
    protected String currentLocation;
    protected String userId;

    /**
     * Gets the value of the maxHealth property.
     * 
     */
    public int getMaxHealth() {
        return maxHealth;
    }

    /**
     * Sets the value of the maxHealth property.
     * 
     */
    public void setMaxHealth(int value) {
        this.maxHealth = value;
    }

    /**
     * Gets the value of the currentHealth property.
     * 
     */
    public int getCurrentHealth() {
        return currentHealth;
    }

    /**
     * Sets the value of the currentHealth property.
     * 
     */
    public void setCurrentHealth(int value) {
        this.currentHealth = value;
    }

    /**
     * Gets the value of the deductedhealth property.
     * 
     */
    public int getDeductedhealth() {
        return deductedhealth;
    }

    /**
     * Sets the value of the deductedhealth property.
     * 
     */
    public void setDeductedhealth(int value) {
        this.deductedhealth = value;
    }

    /**
     * Gets the value of the movementFactory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMovementFactory() {
        return movementFactory;
    }

    /**
     * Sets the value of the movementFactory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMovementFactory(String value) {
        this.movementFactory = value;
    }

    /**
     * Gets the value of the currentLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrentLocation() {
        return currentLocation;
    }

    /**
     * Sets the value of the currentLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrentLocation(String value) {
        this.currentLocation = value;
    }

    /**
     * Gets the value of the userId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserId() {
        return userId;
    }

    /**
     * Sets the value of the userId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserId(String value) {
        this.userId = value;
    }

}
