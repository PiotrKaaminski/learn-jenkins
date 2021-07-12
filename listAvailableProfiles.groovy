def availableProfiles() {
    def profiles = 'pwd'.execute().text
    return profiles
}

return this