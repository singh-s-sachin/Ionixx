//
//  Roundbtn.swift
//  ionixx
//
//  Created by Developer on 29/04/19.
//  Copyright © 2019 Developer. All rights reserved.
//

import Foundation
import UIKit

@IBDesignable
class Roundedbutton: UIButton {
    
    @IBInspectable var cornerRadius: CGFloat = 3.0 {
        didSet {
            self.layer.cornerRadius = cornerRadius
        }
    }
    
    override func awakeFromNib() {
        self.setupView()
    }
    
    override func prepareForInterfaceBuilder() {
        super.prepareForInterfaceBuilder()
        self.setupView()
    }
    
    func setupView() {
        self.layer.cornerRadius = cornerRadius
    }
}
