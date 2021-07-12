def availableProfiles() {
    def profiles = 'cd $WORKSPACE | pwd'.execute().text
    return profiles
}

return this