package com.tutorials.hp.recyclerstickyheaders;

/**
 * Created by Oclemy on 2017 for ProgrammingWizards TV Channel and http://www.camposha.info.
 - Our data object
 - We pass it data via constructor.
 - We retrieve its data via getters.
 */

public class Galaxy {

    private String name,description;
    private int image;
    private Category category;

    public Galaxy(String name, String description, int image,Category category) {
        this.name = name;
        this.description = description;
        this.image = image;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getImage() {
        return image;
    }

    public int getCategoryId() {
        return category.getId();
    }

    public String getCategoryName() {
        return category.getName();
    }
}
