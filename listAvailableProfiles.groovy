def availableProfiles() {
    def profiles = 'mvn help:all-profiles'.execute().text
    return profiles
}

return this