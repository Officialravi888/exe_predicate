package com.Enums;

public class Enum1 {
    public enum Gender {
        FEMALE(1, "f"),
        MALE(2, "m"),
        UNDEFINED(3, "u");
        private int repr;
        private String descr;

        Gender(int repr, String descr) {
            this.repr = repr;
            this.descr = descr;
        }

        public int getRepr() {
            return repr;
        }

        public void setRepr(int repr) {
            this.repr = repr;
        }

        public String getDescr() {
            return descr;
        }

        public void setDescr(String descr) {
            this.descr = descr;
        }

        @Override
        public String toString() {
            return "Gender{" +
                    "repr=" + repr +
                    ", descr='" + descr + '\'' +
                    '}';
        }

        public static void main(String[] args) {

        }
    }
}