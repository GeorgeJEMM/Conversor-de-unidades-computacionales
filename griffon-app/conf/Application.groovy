application {
    title = 'ProyectoII'
    startupGroups = ['proyectoII']

    // Should Griffon exit when no Griffon created frames are showing?
    autoShutdown = true

    // If you want some non-standard application class, apply it here
    //frameClass = 'javax.swing.JFrame'
}
mvcGroups {
    // MVC Group for "proyectoII"
    'proyectoII' {
        model      = 'proyectoii.ProyectoIIModel'
        view       = 'proyectoii.ProyectoIIView'
        controller = 'proyectoii.ProyectoIIController'
    }

}
