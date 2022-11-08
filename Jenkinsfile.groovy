node {
 try {

     stage ('premier etape ') {

         sh "echo 'premier etape pipiline ='"
     }     

 }    

 finally {

      cleanWs()

  }

   }
