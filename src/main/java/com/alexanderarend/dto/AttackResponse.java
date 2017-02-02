
package com.alexanderarend.dto;

public class AttackResponse {

    protected String newCoords;
    protected String userIdHitByAttack;
    protected int damageDone;
    protected String hitTrue;
    protected String attackId;
    protected String userId;
    protected int rangeRemaining;

    /**
     * Gets the value of the newCoords property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewCoords() {
        return newCoords;
    }

    /**
     * Sets the value of the newCoords property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewCoords(String value) {
        this.newCoords = value;
    }

    /**
     * Gets the value of the userIdHitByAttack property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserIdHitByAttack() {
        return userIdHitByAttack;
    }

    /**
     * Sets the value of the userIdHitByAttack property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserIdHitByAttack(String value) {
        this.userIdHitByAttack = value;
    }

    /**
     * Gets the value of the damageDone property.
     * 
     */
    public int getDamageDone() {
        return damageDone;
    }

    /**
     * Sets the value of the damageDone property.
     * 
     */
    public void setDamageDone(int value) {
        this.damageDone = value;
    }

    /**
     * Gets the value of the hitTrue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHitTrue() {
        return hitTrue;
    }

    /**
     * Sets the value of the hitTrue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHitTrue(String value) {
        this.hitTrue = value;
    }

    /**
     * Gets the value of the attackId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttackId() {
        return attackId;
    }

    /**
     * Sets the value of the attackId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttackId(String value) {
        this.attackId = value;
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
     * Gets the value of the rangeRemaining property.
     * 
     */
    public int getRangeRemaining() {
        return rangeRemaining;
    }

    /**
     * Sets the value of the rangeRemaining property.
     * 
     */
    public void setRangeRemaining(int value) {
        this.rangeRemaining = value;
    }

}
