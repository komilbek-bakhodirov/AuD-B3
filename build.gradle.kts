plugins {
    alias(libs.plugins.algomate)
    alias(libs.plugins.jagr)
}

exercise {
    assignmentId.set("p1")
}

submission {
    // ACHTUNG!
    // Setzen Sie im folgenden Bereich Ihre TU-ID (NICHT Ihre Matrikelnummer!), Ihren Nachnamen und Ihren Vornamen
    // in Anführungszeichen (z.B. "ab12cdef" für Ihre TU-ID) ein!
    studentId = "kb83lyco"
    firstName = "Komilbek"
    lastName = "Bakhodirov"

    // Optionally require own tests for mainBuildSubmission task. Default is false
    requireTests = false
    // Optionally require public grader for mainBuildSubmission task. Default is false
    requireGraderPublic = false
}
