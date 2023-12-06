import java.awt.*
import javax.swing.JFrame

class Main : JFrame(){
    init{
        title = "Password Gen"
        defaultCloseOperation = EXIT_ON_CLOSE
        layout = BorderLayout()

        // create music structure and panels
        val pass = Password()
        val displayPanel = DisplayPanel(pass)
        val selectionPanel = SelectionPanel(pass, displayPanel)

        // set panel sizes
        selectionPanel.preferredSize = Dimension(350, 100)
        displayPanel.preferredSize = Dimension(350, 50)

        // add panels to frame
        add(selectionPanel, BorderLayout.CENTER)
        add(displayPanel, BorderLayout.SOUTH)

        pack()
        setLocationRelativeTo(null) // center frame on screen

        isResizable = false

        isVisible = true
    }
}

fun main() {
    Main()
}