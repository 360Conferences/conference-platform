import SwiftUI
import common

struct ContentView: View {
    var body: some View {
        Text(SampleKt.hello())
    }
}

struct ContentView_Previews: PreviewProvider {
    static var previews: some View {
        ContentView()
    }
}
