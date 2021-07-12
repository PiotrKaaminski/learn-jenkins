def availableProfiles() {
    def profiles = 'ls'.execute().text
    return profiles
}

return this