
package com.alexanderarend.dto;

public class MoveCharacterResponse {

    protected String newCoordinates;
    protected String pixelMovementAmount;
    protected String userId;

    /**
     * Gets the value of the newCoordinates property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewCoordinates() {
        return newCoordinates;
    }

    /**
     * Sets the value of the newCoordinates property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewCoordinates(String value) {
        this.newCoordinates = value;
    }

    /**
     * Gets the value of the pixelMovementAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPixelMovementAmount() {
        return pixelMovementAmount;
    }

    /**
     * Sets the value of the pixelMovementAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPixelMovementAmount(String value) {
        this.pixelMovementAmount = value;
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
