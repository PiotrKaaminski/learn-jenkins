def availableProfiles() {
    'cd $WORKSPACE'.execute()
    println 'pwd'.execute().text
    def profiles = 'mvn help:all-profiles'.execute().text
    return profiles
}

return this