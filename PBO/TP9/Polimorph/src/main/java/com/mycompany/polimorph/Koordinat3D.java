/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.polimorph;

/**
 *
 * @author ihabh
 */
public class Koordinat3D extends Koordinat {
    private int z;

    public Koordinat3D(int x, int y, int z) {
        super(x, y);
        this.setZ(z);
    }

    /**
     * @return the z
     */
    public int getZ() {
        return z;
    }

    /**
     * @param z the z to set
     */
    public void setZ(int z) {
        this.z = z;
    }
    
}
