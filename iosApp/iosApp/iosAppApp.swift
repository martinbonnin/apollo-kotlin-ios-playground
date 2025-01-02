//
//  iosAppApp.swift
//  iosApp
//
//  Created by Martin Bonnin on 02/01/2025.
//

import SwiftUI
import apollo_kotlin_ios_playground

@main
struct iosAppApp: App {
    init() {
        for index in 1...100 {
            let conferences = ApiKt.getConferences()
            print(conferences)
        }
    }
    var body: some Scene {
        WindowGroup {
            ContentView()
        }
    }
}
