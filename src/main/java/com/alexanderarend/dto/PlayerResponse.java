
package com.alexanderarend.dto;


public class PlayerResponse {

    protected String successUpdating;
    protected String isDead;
    protected String userId;
    protected int currentHealth;

    /**
     * Gets the value of the successUpdating property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuccessUpdating() {
        return successUpdating;
    }

    /**
     * Sets the value of the successUpdating property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuccessUpdating(String value) {
        this.successUpdating = value;
    }

    /**
     * Gets the value of the isDead property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsDead() {
        return isDead;
    }

    /**
     * Sets the value of the isDead property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsDead(String value) {
        this.isDead = value;
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

}
