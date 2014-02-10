package com.robb1e.helloworld

import org.springframework.stereotype.Service

interface Name {
	String name()
}

@Service
class NameService implements Name {

	@Override
	String name() {
		"world"
	}

}
