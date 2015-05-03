Arno
=============
**Currently not stable and under heavy development!**  
A Forge implementation of CanaryLib, licensed under the [MIT License]. 

* [Homepage]
* [Source]
* [Issues]
* [Community Chat]: #neptune on irc.esper.net
* [Development Chat]: #neptunedev on irc.esper.net

## Prerequisites
* [Java] 6

## Clone
The following steps will ensure your project is cloned properly.
    1. `git clone --recursive https://github.com/NeptunePowered/Arno.git`
    2. `cd Arno`

## Setup
__Note:__ If you do not have [Gradle] installed then use ./gradlew for Unix systems or Git Bash and gradlew.bat for Windows systems in place of any 'gradle' command.

__For [Eclipse]__  
  1. Run `gradle setupDecompWorkspace --refresh-dependencies`  
  2. Run `gradle eclipse`
  3. Import Arno as an existing project (File > Import > General)
  4. Select the root folder for Arno and make sure `Search for nested projects` is enabled
  5. Check Arno when it finishes building and click **Finish**

__For [IntelliJ]__  
  1. Run `gradle setupDecompWorkspace --refresh-dependencies`  
  2. Make sure you have the Gradle plugin enabled (File > Settings > Plugins).  
  3. Click File > New > Project from Existing Sources > Gradle and select the root folder for Arno.

## Running
__Note:__ The following is aimed to help you setup run configurations for Eclipse and IntelliJ, if you do not want to be able to run Arno directly from your IDE then you can skip this.  

__For [Eclipse]__  
  1. Go to **Run > Run Configurations**.  
  2. Right-click **Java Application** and select **New**.  
  3. Set the current project.  
  4. Set the name as `Arno (Client)` and apply the information for Client below.  
  5. Repeat step 1 through 4, then set the name as `Arno (Server)` and apply the information for Server below.  
  6. When launching the server for the first time, it will shutdown by itself. You will need to modify the server.properties to set onlinemode=false and modify the eula.txt to set eula=true (this means you agree to the Mojang EULA, if you do not wish to do this then you cannot run the server)

__For [IntelliJ]__  
  1. Go to **Run > Edit Configurations**.  
  2. Click the green + button and select **Application**.  
  3. Set the name as `Arno (Client)` and apply the information for Client below.  
  4. Repeat step 2 and set the name as `Arno (Server)` and apply the information for Server below.  
  5. When launching the server for the first time, it will shutdown by itself. You will need to modify the server.properties to set onlinemode=false and modify the eula.txt to set eula=true (this means you agree to the Mojang EULA, if you do not wish to do this then you cannot run the server).

__Client__

|     Property      | Value                                     |
|:-----------------:|:------------------------------------------|
|    Main class     | GradleStart                               |
|    VM options     | -Dfml.coreMods.load=org.neptunepowered.arno.ArnoCoremod |
| Working directory | ./run/client (Included in project)        |
| Module classpath  | Arno (IntelliJ Only)                    |

__Server__

|     Property      | Value                              |
|:-----------------:|:-----------------------------------|
|    Main class     | GradleStartServer                  |
|    VM Options     | -Dfml.coreMods.load=org.neptunepowered.arno.ArnoCoremod |
| Working directory | ./run/server (Included in project) |
| Module classpath  | Arno (IntelliJ Only)             |

## Building
__Note:__ If you do not have [Gradle] installed then use ./gradlew for Unix systems or Git Bash and gradlew.bat for Windows systems in place of any 'gradle' command.

In order to build Arno you simply need to run the `gradle` command. You can find the compiled JAR file in `./build/libs` labeled similarly to 'Arno-x.x.x-SNAPSHOT.jar'.

## Contributing
Are you a talented programmer looking to contribute some code? We'd love the help!
* Open a pull request with your changes, following our [guidelines](CONTRIBUTING.md).
* Please follow the above guidelines for your pull request(s) to be accepted.

[Eclipse]: http://www.eclipse.org/
[Gradle]: http://www.gradle.org/
[Homepage]: http://www.neptunepowered.org/
[IntelliJ]: http://www.jetbrains.com/idea/
[Issues]: https://github.com/NeptunePowered/Arno/issues
[Java]: http://java.oracle.com/
[Source]: https://github.com/NeptunePowered/
[MIT License]: http://www.tldrlegal.com/license/mit-license
[Community Chat]: https://kiwiirc.com/client/irc.esper.net/?#neptune
[Development Chat]: https://kiwiirc.com/client/irc.esper.net/?#neptunedev