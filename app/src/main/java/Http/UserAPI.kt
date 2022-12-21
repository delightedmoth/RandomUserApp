package Http

import io.ktor.client.*
import io.ktor.client.request.*


class UserApi(private val client: HttpClient) {
    val END_POINT_GET_USER_KTOR = ""
    val END_POINT_POST_USER_KTOR = ""

    suspend fun getUserKtor(
        userId: String, count: Int
    ): UserEntity = client.get("https://random-data-api.com/api/v2/users")

    suspend fun saveUser(user: UserEntity) {
        client.post<UserEntity>("$END_POINT_POST_USER_KTOR") {
            body = user
        }
    }
}

class GetUserApi(private val client: HttpClient) {
    suspend fun load(count: Int): String {
        return client.get("https://random-data-api.com/api/v2/users")
    }
}