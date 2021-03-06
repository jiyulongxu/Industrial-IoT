// <auto-generated>
// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
//
// Code generated by Microsoft (R) AutoRest Code Generator 1.0.0.0
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.
// </auto-generated>

namespace Microsoft.Azure.IIoT.Opc.Registry.Models
{
    using Microsoft.Rest;
    using Newtonsoft.Json;
    using System.Linq;

    /// <summary>
    /// Gateway info model
    /// </summary>
    public partial class GatewayInfoApiModel
    {
        /// <summary>
        /// Initializes a new instance of the GatewayInfoApiModel class.
        /// </summary>
        public GatewayInfoApiModel()
        {
            CustomInit();
        }

        /// <summary>
        /// Initializes a new instance of the GatewayInfoApiModel class.
        /// </summary>
        public GatewayInfoApiModel(GatewayApiModel gateway, GatewayModulesApiModel modules = default(GatewayModulesApiModel))
        {
            Gateway = gateway;
            Modules = modules;
            CustomInit();
        }

        /// <summary>
        /// An initialization method that performs custom operations like setting defaults
        /// </summary>
        partial void CustomInit();

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "gateway")]
        public GatewayApiModel Gateway { get; set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "modules")]
        public GatewayModulesApiModel Modules { get; set; }

        /// <summary>
        /// Validate the object.
        /// </summary>
        /// <exception cref="ValidationException">
        /// Thrown if validation fails
        /// </exception>
        public virtual void Validate()
        {
            if (Gateway == null)
            {
                throw new ValidationException(ValidationRules.CannotBeNull, "Gateway");
            }
            if (Gateway != null)
            {
                Gateway.Validate();
            }
            if (Modules != null)
            {
                Modules.Validate();
            }
        }
    }
}
