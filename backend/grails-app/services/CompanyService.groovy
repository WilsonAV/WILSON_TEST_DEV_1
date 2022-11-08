package backend

import grails.gorm.transactions.Transactional
import Company

@Transactional
class CompanyService {

    def serviceMethod() {

    }

    def findAll() {
        return Company.findAll();
    }
}