//
//  adminpanel.swift
//  ionixx
//
//  Created by Developer on 29/04/19.
//  Copyright © 2019 Developer. All rights reserved.
//

import UIKit

class adminpanel: UIViewController {

    override func viewDidLoad() {
        super.viewDidLoad()

        // Do any additional setup after loading the view.
    }

    @IBAction func logoutbtnpressed(_ sender: Any) {
        dismiss(animated: true, completion: nil)
    }
    @IBAction func createeventpressed(_ sender: Any) {
        performSegue(withIdentifier: "tocreate", sender: nil)
    }
    @IBAction func generatepressed(_ sender: Any) {
    }
    /*
    // MARK: - Navigation

    // In a storyboard-based application, you will often want to do a little preparation before navigation
    override func prepare(for segue: UIStoryboardSegue, sender: Any?) {
        // Get the new view controller using segue.destination.
        // Pass the selected object to the new view controller.
    }
    */

}
