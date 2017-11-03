# Clever Java Library

Client library for the Clever API

## Installation

Manually install the Clever JAR: https://github.com/Clever/clever-java/releases


## Usage
```
import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.Configuration;
import io.swagger.client.api.DefaultApi;
import io.swagger.client.auth.OAuth;
import io.swagger.client.model.*;

public class CleverAPI {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        // Configure OAuth2 access token for authorization: oauth
        OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
        oauth.setAccessToken("TODO: SET ME!");

        DefaultApi api = new DefaultApi();
        try {
            StudentsResponse students = api.getStudents(10, null, null);
            for (StudentResponse student : students.getData()) {
                System.out.println("Student IDs: " + student.getData().getId());
            }
        } catch (ApiException e) {
            System.err.println("Exception:");
            e.printStackTrace();
        }
    }
}
```

### Events Usage
Since events are polymorphic, we use the type to determine how to cast them. For example:
```
public void processEvents(DefaultApi api) {
    EventsResponse eventsResponse = api.getEvents(10, null, null);

    for (EventResponse eventResp : eventsResponse.getData()) {
        if (eventResp.getData().getType() == "students.created") {
            StudentsCreated event = (StudentsCreated)eventResp.getData();
            // Process the event...
        }
    }
}
```

## Generating the JAR
1. Git clone swagger-codegen (https://github.com/swagger-api/swagger-codegen)

2. Git clone Clever's swagger-api repo (https://github.com/Clever/swagger-api)

3. Install Java and Maven

4. Are you removing some old models? Consider removing existing files from `docs/` and `src/` before regenerating files

5. Are you adding new event types? Consider override files that need to be updated in `override/`

6. Update the client version in `override/pom.xml`

7. In the root directory of the swagger repo run:
```
java -jar modules/swagger-codegen-cli/target/swagger-codegen-cli.jar generate -i $PATH_TO_SWAGGER_API_REPO/v2.0-client.yml -l java -o $PATH_TO_THIS_REPO
```

8. Package the JAR

```
make build
```

That will put the jar in: `target/client-X.Y.Z.jar`


## Publishing

To publish this library first set up your settings.xml (~/.m2/settings.xml) as described here: http://central.sonatype.org/pages/apache-maven.html. In particular setting up the ossrh profile using the clever-eng username / password and setting up the GPG profile with the security@clever.com PGP key.

Then run:
```
make release
```

This will deploy to: https://oss.sonatype.org/content/groups/public/com/clever/client/

The jar will be synced over to the Maven central repository within the next few hours.

If you get an `Inappropriate ioctl for device error` try the commands here: https://github.com/pstadler/keybase-gpg-github/pull/13/files
