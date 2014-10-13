import com.studentenrol.*

class BootStrap {

    def init = { servletContext ->
	def course1= new Course( title: 'Interactive Media with Animation', department: 'Computing', description: '''Lorum ipsum dolor sit amet, ad sea solum brute sunsibus, te summo senserit vix, mel reque corpora vulputate ei.''', leader: 'Joe Jojo', code: 'IMA101', startDate: new Date('19/01/2015'), endDate: new Date('19/01/2020'))

	if(!course1.save()){
		course1.errors.allErrors.each{ error ->
		println "An error occurred whilstcreating course1:${error}"
	}

	}
    }
    def destroy = {
    }
}
