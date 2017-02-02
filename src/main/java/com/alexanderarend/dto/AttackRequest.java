
package com.alexanderarend.dto;

public class AttackRequest {

    protected String currentCoords;
    protected String coordinatesAffected;
    protected String direction;
    protected int movementType;
    protected int range;
    protected String attackId;
    protected String userId;

    /**
     * Gets the value of the currentCoords property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrentCoords() {
        return currentCoords;
    }

    /**
     * Sets the value of the currentCoords property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrentCoords(String value) {
        this.currentCoords = value;
    }

    /**
     * Gets the value of the coordinatesAffected property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoordinatesAffected() {
        return coordinatesAffected;
    }

    /**
     * Sets the value of the coordinatesAffected property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoordinatesAffected(String value) {
        this.coordinatesAffected = value;
    }

    /**
     * Gets the value of the direction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirection() {
        return direction;
    }

    /**
     * Sets the value of the direction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirection(String value) {
        this.direction = value;
    }

    /**
     * Gets the value of the movementType property.
     * 
     */
    public int getMovementType() {
        return movementType;
    }

    /**
     * Sets the value of the movementType property.
     * 
     */
    public void setMovementType(int value) {
        this.movementType = value;
    }

    /**
     * Gets the value of the range property.
     * 
     */
    public int getRange() {
        return range;
    }

    /**
     * Sets the value of the range property.
     * 
     */
    public void setRange(int value) {
        this.range = value;
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

}
