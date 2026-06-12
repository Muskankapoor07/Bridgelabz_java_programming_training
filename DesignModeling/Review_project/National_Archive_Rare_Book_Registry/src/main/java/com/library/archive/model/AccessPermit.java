package com.library.archive.model;

public class AccessPermit {

    private final String researcherId;
    private final String resourceId;
    private final int roomNumber;

    private AccessPermit(Builder builder) {
        this.researcherId = builder.researcherId;
        this.resourceId = builder.resourceId;
        this.roomNumber = builder.roomNumber;
    }

    public String getResearcherId() {
        return researcherId;
    }

    public String getResourceId() {
        return resourceId;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public static class Builder {

        private String researcherId;
        private String resourceId;
        private int roomNumber;

        public Builder researcherId(String researcherId) {
            this.researcherId = researcherId;
            return this;
        }

        public Builder resourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }

        public Builder roomNumber(int roomNumber) {
            this.roomNumber = roomNumber;
            return this;
        }

        public AccessPermit build() {
            return new AccessPermit(this);
        }
    }
}