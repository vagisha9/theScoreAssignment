package com.theScore.test.common

class Properties: java.util.Properties() {
    init {
        this.load(java.io.FileInputStream("src/test/resources/properties/test.properties"))
    }
}