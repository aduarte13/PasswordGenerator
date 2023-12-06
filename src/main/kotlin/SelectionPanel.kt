import java.awt.FlowLayout
import java.awt.event.ActionEvent
import java.awt.event.ActionListener
import javax.swing.*

class SelectionPanel(
    private val pass: Password,
    private val displayPanel: DisplayPanel
) : JPanel(){

    private val sliderOptionLength: JSlider = JSlider(5, 35, 10)
    //private var optionIncludeNumber: Boolean = true,
    //private var optionIncludeUpperAndLower: Boolean = false,
    //private var optionIncludeSpecial: Boolean = false,
    //private var optionIncludeWord: Boolean = false,
    //private var optionNoDuplicates: Boolean = false

    init {
        border = BorderFactory.createTitledBorder("Options")
        layout = FlowLayout()

        //
        sliderOptionLength.paintTicks = true
        sliderOptionLength.paintTrack = true
        sliderOptionLength.paintLabels = true
        sliderOptionLength.majorTickSpacing = 10
        sliderOptionLength.minorTickSpacing = 5

        // add components to panel
        add(sliderOptionLength)

    }
}


