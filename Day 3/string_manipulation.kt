/*
Concepts Covered:
- uppercase() and lowercase()
- replaceFirstChar()
- trim(), trimStart(), trimEnd()
- contains(), startsWith(), endsWith()
- replace()
- split()
- substring()
- length
*/

fun main() {

    // Original string
    val username = "   sHRAVAN aPTE   "

    // 1. Case conversion
    println("Uppercase: ${username.uppercase()}")
    println("Lowercase: ${username.lowercase()}")
    println("First character uppercase: ${username.trim().replaceFirstChar { it.uppercase() }}")

    // 2. Whitespace removal
    println("Trim: '${username.trim()}'")
    println("Trim Start: '${username.trimStart()}'")
    println("Trim End: '${username.trimEnd()}'")

    // 3. Searching strings
    val filename = "profile_picture.png"

    println("Starts with profile: ${filename.startsWith("profile")}")
    println("Ends with jpg: ${filename.endsWith(".jpg")}")
    println("Contains picture: ${filename.contains("picture")}")

    // 4. Replacing text
    val language = "I love Java and Java is powerful"
    val updatedLanguage = language.replace("Java", "Kotlin")

    println("Updated language: $updatedLanguage")

    // 5. Splitting strings
    val email = "shravan@gmail.com"
    val emailParts = email.split("@")

    println("Email username: ${emailParts[0]}")
    println("Email domain: ${emailParts[1]}")

    // 6. Extracting text
    val framework = "Flutter"

    println("Substring: ${framework.substring(2, 5)}")

    // 7. String length
    val cleanedUsername = username.trim().lowercase()

    println("Cleaned username: $cleanedUsername")
    println("Username length: ${cleanedUsername.length}")
}