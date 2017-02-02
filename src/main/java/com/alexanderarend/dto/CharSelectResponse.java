
package com.alexanderarend.dto;


public class CharSelectResponse {

    protected int maxHealth;
    protected int currentHealth;
    protected int movementFactor;
    protected String currentLocation;
    protected String charId;
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
     * Gets the value of the movementFactor property.
     * 
     */
    public int getMovementFactor() {
        return movementFactor;
    }

    /**
     * Sets the value of the movementFactor property.
     * 
     */
    public void setMovementFactor(int value) {
        this.movementFactor = value;
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
     * Gets the value of the charId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCharId() {
        return charId;
    }

    /**
     * Sets the value of the charId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCharId(String value) {
        this.charId = value;
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
