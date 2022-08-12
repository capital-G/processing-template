plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.8.1")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.8.1")

    // https://mvnrepository.com/artifact/org.processing/core
    implementation("org.processing:core:3.3.7")

    // processing plugins

    // https://mvnrepository.com/artifact/org.processing/video
//    implementation("org.processing:video:3.3.7")

    // https://mvnrepository.com/artifact/org.processing/net
//    implementation("org.processing:net:3.3.7")

    // https://mvnrepository.com/artifact/org.processing/serial
//    implementation("org.processing:serial:3.3.7")

    // https://mvnrepository.com/artifact/org.processing/pdf
//    implementation("org.processing:pdf:3.3.7")


//    OSC libraries
//    implementation("com.illposed.osc:javaosc-core:0.8")

//    implementation(files("$rootDir/library/oscP5.jar"))
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}