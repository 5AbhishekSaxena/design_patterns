package tech.developingdeveloper.builder_pattern.drivers

import tech.developingdeveloper.builder_pattern.Education
import tech.developingdeveloper.builder_pattern.dsl.address
import tech.developingdeveloper.builder_pattern.dsl.buildUser
import tech.developingdeveloper.builder_pattern.dsl.company
import tech.developingdeveloper.builder_pattern.dsl.contact
import tech.developingdeveloper.builder_pattern.dsl.education
import tech.developingdeveloper.builder_pattern.dsl.educationList


fun main() {
    val user = buildUser {
        firstName = "Abhishek"
        lastName = "Saxena"

        address {
            line1 = "test"
            city = "Delhi"
            state = "Delhi"
            country = "India"
            pincode = 123456
        }

        company {
            name = "Infosys"
        }

        contact {
            githubHandle = "5AbhishekSaxena"
            twitterHandle = "5Abhisheks"
        }

        educationList {
            education {
                school = "SRM University"
                yearOfPassing = 2020
                degree = "B.Tech"
            }

            // or like this
            graduated from "SRM University" inTheYear 2020 with "B.Tech"
            graduated from "ABC University" inTheYear 2022 with "M.Tech"

            // or like this
            +Education(
                "ABC University",
                2022,
                "M.Tech"
            )

            // or like this
            education("SRM University", 2020, "B.Tech")
        }

        // or add it list this
        education {
            school = "SRM University"
            yearOfPassing = 2020
            degree = "B.Tech"
        }
    }

    println(user.toString())

}