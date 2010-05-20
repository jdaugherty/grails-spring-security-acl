grails.project.class.dir = 'target/classes'
grails.project.test.class.dir = 'target/test-classes'
grails.project.test.reports.dir	= 'target/test-reports'

grails.project.dependency.resolution = {

	inherits('global') {
		excludes 'commons-codec' // Grails ships with 1.3, need 1.4
	}

	log 'warn'

	repositories {        
		grailsPlugins()
		grailsHome()
		grailsCentral()

		ebr() // SpringSource  http://www.springsource.com/repository
	}

	dependencies {
		runtime('org.springframework.security:org.springframework.security.acls:3.0.2.RELEASE') {
			excludes 'com.springsource.org.aopalliance',
			         'com.springsource.org.apache.commons.logging',
			         'org.springframework.beans',
			         'org.springframework.context',
			         'org.springframework.core'
		}
	}
}
