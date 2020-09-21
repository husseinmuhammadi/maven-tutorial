# Maven Tutorial

## Maven Profile

A profile can be triggered/activated in several ways:

Explicitly
```
mvn clean install -Pserver 
```
Through Maven settings
```
<settings>
  ...
  <activeProfiles>
    <activeProfile>profile-1</activeProfile>
  </activeProfiles>
  ...
</settings>
```
Based on environment variables
```
mvn clean install -Dmode=server 
```
OS settings

Present or missing files

### How can I tell which profiles are in effect during a build?
```
mvn help:active-profiles
```