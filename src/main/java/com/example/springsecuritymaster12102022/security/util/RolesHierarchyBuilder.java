package com.example.springsecuritymaster12102022.security.util;

public class RolesHierarchyBuilder {

    private StringBuilder stringBuilder = new StringBuilder();

    public RolesHierarchyBuilder append(String upLineRole, String downLineRole) {
        stringBuilder.append(
                String.format("ROLE_%s > ROLE_%s", upLineRole, downLineRole)
        );

        return this;
    }

    public String build() {
        return stringBuilder.toString();
    }
}
