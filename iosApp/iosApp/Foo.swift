import Foundation
import UIKit
import shared

func foo() {
    var c = shared.LanguageToolUseCases.shared
    IosConfig()
        .koin()
        .build()
    print("CallingFoo")
    c.checkGrammar.invoke(text: "What is dis?") { result, _ in
        print("InCallback")
        print(result)
        let cor = result?.component1() as? [Correction]
        print(cor)
    }
}
