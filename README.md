# Conference Management Platform
Manage proposal submission, speaker selection, agenda and mobile applications.

# Build Targets
Project contains build targets for 4 applications:
- **androidapp**: native Android app
- **iosapp**: native iOS app
- **backend**: JVM-based Ktor server
- **browser**: KotlinJS browser project

## Android
- Connect a test device
- Deploy with `./gradlew :androidapp:installDebug`

## iOS
- `cd iosapp`
- `pod install`
- Open `iosapp.xcworkspace` with XCode
- Build and deploy app to simulator

## Backend
- Deploy locally with `./gradlew :backend:run`
- Console output should include `Responding at <local browser address>`

## Browser
- Deploy locally with `./gradlew :browser:browserRun`