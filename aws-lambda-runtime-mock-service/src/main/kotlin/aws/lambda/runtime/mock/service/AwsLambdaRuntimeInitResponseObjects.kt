package aws.lambda.runtime.mock.service

data class AwsLambdaRuntimeInitResponse(
    val body: String? = null,
    val headers: Map<String, String> = emptyMap(),
    val httpMethod: String = "GET",
    val isBase64Encoded: Boolean = false,
    val multiValueHeaders: Map<String, List<String>>? = null,
    val multiValueQueryStringParameters: Map<String, List<String>>? = null,
    val path: String,
    val pathParameters: Map<String, String>? = null,
    val queryStringParameters: Map<String, String>? = null,
    val requestContext: RequestContext,
    val resource: String,
    val stageVariables: Map<String, String>? = null
)

data class RequestContext(
    val accountId: String,
    val apiId: String,
    val domainName: String,
    val domainPrefix: String,
    val extendedRequestId: String,
    val httpMethod: String,
    val identity: Identity,
    val path: String,
    val protocol: String,
    val requestId: String,
    val requestTime: String,
    val requestTimeEpoch: Long,
    val resourceId: String,
    val resourcePath: String,
    val stage: String
)

data class Identity(
    val accessKey: Any?,
    val accountId: Any?,
    val caller: Any?,
    val cognitoAuthenticationProvider: Any?,
    val cognitoAuthenticationType: Any?,
    val cognitoIdentityId: Any?,
    val cognitoIdentityPoolId: Any?,
    val principalOrgId: Any?,
    val sourceIp: String,
    val user: Any?,
    val userAgent: String,
    val userArn: Any?
)

val MOCK = AwsLambdaRuntimeInitResponse(
    httpMethod = "GET",
    resource = "/",
    path = "/",
    headers = mapOf(
        "Accept" to "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9",
        "Accept-Encoding" to "gzip, deflate, br",
        "Accept-Language" to "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7",
        "CloudFront-Forwarded-Proto" to "https",
        "CloudFront-Is-Desktop-Viewer" to "true",
        "CloudFront-Is-Mobile-Viewer" to "false",
        "CloudFront-Is-SmartTV-Viewer" to "false",
        "CloudFront-Is-Tablet-Viewer" to "false",
        "CloudFront-Viewer-Country" to "RU",
        "Cookie" to "_ga=GA1.2.728036879.1590535222; _gcl_au=1.1.390825955.1590535222",
        "Host" to "ktor.site.kotless.io",
        "sec-fetch-dest" to "document",
        "sec-fetch-mode" to "navigate",
        "sec-fetch-site" to "none",
        "sec-fetch-user" to "?1",
        "upgrade-insecure-requests" to "1",
        "User-Agent" to "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/84.0.4147.105 Safari/537.36",
        "Via" to "2.0 78dbcb60ca54760934851cf8d8476f3a.cloudfront.net (CloudFront)",
        "X-Amz-Cf-Id" to "Ij9VtlJOR5wV1Aj1bwHyJHRLjj__IQHxv4S-KVdOR9fOi4yWHf4mxg==",
        "X-Amzn-Trace-Id" to "Root=1-5f2c7242-45a3a1eadbb9f84dab609039",
        "X-Forwarded-For" to "185.102.11.199, 52.46.36.88",
        "X-Forwarded-Port" to "443",
        "X-Forwarded-Proto" to "https"
    ),
    multiValueHeaders = mapOf(
        "Accept" to listOf("text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9"),
        "Accept-Encoding" to listOf("gzip, deflate, br"),
        "Accept-Language" to listOf("ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7"),
        "CloudFront-Forwarded-Proto" to listOf("https"),
        "CloudFront-Is-Desktop-Viewer" to listOf("true"),
        "CloudFront-Is-Mobile-Viewer" to listOf("false"),
        "CloudFront-Is-SmartTV-Viewer" to listOf("false"),
        "CloudFront-Is-Tablet-Viewer" to listOf("false"),
        "CloudFront-Viewer-Country" to listOf("EN"),
        "Cookie" to listOf("_ga=GA1.7.722896879.1590535222; _gcl_au=1.1.5df98966.454565212"),
        "Host" to listOf("ktor.site.kotless.io"),
        "sec-fetch-dest" to listOf("document"),
        "sec-fetch-mode" to listOf("navigate"),
        "sec-fetch-site" to listOf("none"),
        "sec-fetch-user" to listOf("?1"),
        "upgrade-insecure-requests" to listOf("1"),
        "User-Agent" to listOf("Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/84.0.4147.105 Safari/537.36"),
        "Via" to listOf("2.0 78dbcb60ca51234567891cf8d8476f3a.cloudfront.net (CloudFront)"),
        "X-Amz-Cf-Id" to listOf("Lj6VtlPOP5wV1Aj1bwHyJHRLjj__IQHxv4S-ZRdOR9fLi4oWPo4mxg=="),
        "X-Amzn-Trace-Id" to listOf("Root=1-5f2c0987-12a3a1eadbb9f84dab6012345"),
        "X-Forwarded-For" to listOf("186.111.11.111, 55.55.55.55"),
        "X-Forwarded-Port" to listOf("443"),
        "X-Forwarded-Proto" to listOf("https")
    ),
    stageVariables = mapOf("deployed_at" to "2020-08-06T21:12:24Z"),
    requestContext = RequestContext(
        resourceId = "ecjjkoqwa7",
        resourcePath = "/",
        httpMethod = "GET",
        extendedRequestId = "Q3bKbH2pjoEFR4Q=",
        requestTime = "06/Aug/2020 =21 =12 =34 +0000",
        path = "/",
        accountId = "290147673817",
        protocol = "HTTP/1.1",
        stage = "1",
        domainPrefix = "ktor",
        requestTimeEpoch = 1596748354624,
        requestId = "3551dcfa-ea7d-4a91-872c-b8e2996030cf",
        identity = Identity(
            cognitoIdentityPoolId = null,
            accountId = null,
            cognitoIdentityId = null,
            caller = null,
            sourceIp = "185.102.11.199",
            principalOrgId = null,
            accessKey = null,
            cognitoAuthenticationType = null,
            cognitoAuthenticationProvider = null,
            userArn = null,
            userAgent = "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/84.0.4147.105 Safari/537.36",
            user = null
        ),
        domainName = "localhost:8080",
        apiId = "lidsn54uk6"
    )
)