def availableProfiles() {
    return 'mvn help:all-profiles | grep "Profile Id:" | awk "{print $3}" | tr "\n"" ","'.execute()
}

return this