multibranchPipelineJob('jenkinstest') {
    branchSources {
        git {
            id('jenkinstest-id') // unique id
            remote('https://github.com/highlloyd/jenkinstest.git')
        }
    }
    triggers {
        periodic(1) // Poll SCM every minute
    }
    orphanedItemStrategy {
        discardOldItems {
            numToKeep(10)
        }
    }
}

