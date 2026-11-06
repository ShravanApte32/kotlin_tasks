/*
Question:

Create a sealed class named AuthResult to represent different authentication states.

Requirements:
1. Create the following subclasses:
   - Authenticating – singleton object.
   - Authenticated – data class containing userId: Int and username: String.
   - Unauthenticated – data class containing reason: String.
   - SessionExpired – singleton object.
2. Create a function handleAuth() that accepts an AuthResult.
3. Use an exhaustive when expression to handle every authentication state.
4. Access the relevant properties of the data classes.
5. Test all four states inside main().

Expected output:
Authenticating user...
Welcome Shravan! User ID: 101
Login failed: Invalid credentials
Your session has expired. Please log in again.
*/

fun main() {
    handleAuth(AuthResult.Authenticating)
    handleAuth(AuthResult.Authenticated(101, "Shravan"))
    handleAuth(AuthResult.Unauthenticated("Invalid credentials"))
    handleAuth(AuthResult.SessionExpired)
}

sealed class AuthResult {
    object Authenticating : AuthResult()
    data class Authenticated(val userId: Int, val username: String) : AuthResult()
    data class Unauthenticated(val reason: String) : AuthResult()
    object SessionExpired : AuthResult()
}

fun handleAuth(result: AuthResult) {
    when (result) {
        is AuthResult.Authenticating ->
            println("Authenticating user...")
        is AuthResult.Authenticated ->
            println("Welcome ${result.username}! User ID: ${result.userId}")
        is AuthResult.Unauthenticated ->
            println("Login failed: ${result.reason}")
        is AuthResult.SessionExpired ->
            println("Your session has expired. Please log in again.")
    }
}
