/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.polsl.PawelZachara.lab.projekt.Model;

/**
 *
 * simple class for coordinates
 */
public class Point
    {
        private float x;
        private float y;
        
        /**
         * @return the x
         */
        public float getX() {
            return x;
        }

        /**
         * @param x the x to set
         */
        public void setX(float x) {
            this.x = x;
        }

        /**
         * @return the y
         */
        public float getY() {
            return y;
        }

        /**
         * @param y the y to set
         */
        public void setY(float y) {
            this.y = y;
        }
        
        Point(float x,float y)
        {
            this.x = x;
            this.y  =y;
        }
    }
