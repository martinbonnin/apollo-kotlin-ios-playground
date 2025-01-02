import com.apollographql.apollo.ApolloClient
import com.example.GetConferencesQuery
import kotlinx.coroutines.runBlocking

val apolloClient by lazy {
  ApolloClient.Builder()
    .serverUrl("https://confetti-app.dev/graphql")
    .build()
}

fun getConferences(): List<String> {
  return runBlocking {  apolloClient.query(GetConferencesQuery()).execute().data!!.conferences.map { it.name } }
}