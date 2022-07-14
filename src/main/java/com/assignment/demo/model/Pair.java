package com.assignment.demo.model;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;


public class Pair {

        public int categorycode;

        public int value;


        public int getCategorycode() {
                return categorycode;
        }

        public void setCategorycode(int categorycode) {
                this.categorycode = categorycode;
        }

        public int getValue() {
                return value;
        }

        public void setValue(int value) {
                this.value = value;
        }

        public Pair() {
        }

        public Pair(int categorycode, int value) {
                this.categorycode = categorycode;
                this.value = value;
        }
}
