plugins {
    id("earn-app.kotlin")
    application
}

dependencies {
    implementation(project(":earn-app-kotlin"))
}

application {
    mainClass = "com.earn_app.api.example.MainKt"
}
