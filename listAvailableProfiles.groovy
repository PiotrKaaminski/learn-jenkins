def availableProfiles() {
    String profiles = 'mvn help:all-profiles | grep "Profile Id:" | awk "{print $3}" | tr "\n"" " "'.execute().text()
    profiles = profiles.replace(" ", ",")
    return profiles
}

return this