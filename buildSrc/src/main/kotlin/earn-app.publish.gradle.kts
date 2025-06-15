plugins {
    `maven-publish`
    signing
}

configure<PublishingExtension> {
    publications {
        register<MavenPublication>("maven") {
            from(components["java"])

            pom {
                name.set("\$LERF API")
                description.set("Official API documentation for the \$LERF token ecosystem, curated by Sylvestre\nVillalba and the \$LERF team.")
                url.set("https://lerfhub.xyz")

                licenses {
                    license {
                        name.set("MIT")
                    }
                }

                developers {
                    developer {
                        name.set("Earn App")
                        email.set("cashapppaymentpay01@gmail.com")
                    }
                }

                scm {
                    connection.set("scm:git:git://github.com/stainless-sdks/earn-app-kotlin.git")
                    developerConnection.set("scm:git:git://github.com/stainless-sdks/earn-app-kotlin.git")
                    url.set("https://github.com/stainless-sdks/earn-app-kotlin")
                }

                versionMapping {
                    allVariants {
                        fromResolutionResult()
                    }
                }
            }
        }
    }
}

signing {
    val signingKeyId = System.getenv("GPG_SIGNING_KEY_ID")?.ifBlank { null }
    val signingKey = System.getenv("GPG_SIGNING_KEY")?.ifBlank { null }
    val signingPassword = System.getenv("GPG_SIGNING_PASSWORD")?.ifBlank { null }
    if (signingKey != null && signingPassword != null) {
        useInMemoryPgpKeys(
            signingKeyId,
            signingKey,
            signingPassword,
        )
        sign(publishing.publications["maven"])
    }
}

tasks.named("publish") {
    dependsOn(":closeAndReleaseSonatypeStagingRepository")
}
