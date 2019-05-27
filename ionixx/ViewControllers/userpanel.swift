//
//  userpanel.swift
//  ionixx
//
//  Created by Developer on 29/04/19.
//  Copyright © 2019 Developer. All rights reserved.
//

import UIKit

class userpanel: UIViewController {
    
    @IBOutlet weak var amount: UILabel!
    let value2 = UserDefaults.standard.object(forKey: "Budget")
    override func viewDidLoad() {
        super.viewDidLoad()
        amount.text = value2 as? String
        // Do any additional setup after loading the view.
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
